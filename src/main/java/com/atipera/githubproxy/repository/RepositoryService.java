package com.atipera.githubproxy.repository;

import com.atipera.githubproxy.feign.GitHubClient;
import com.atipera.githubproxy.repository.model.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepositoryService {
    private final GitHubClient gitHubClient;

    public RepositoryService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public List<Repository> getUserRepositories(String username) {
        List<Repository> repositories = gitHubClient.getUserRepositories(username).stream()
                .filter(repository -> !repository.isFork())
                .collect(Collectors.toList());
        repositories.forEach(repository -> {
            repository.setBranches(gitHubClient.getRepositoryBranches(username, repository.getName()));
        });
        return repositories;
    }
}
