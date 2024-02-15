package com.atipera.githubproxy.feign;

import com.atipera.githubproxy.repository.model.Branch;
import com.atipera.githubproxy.repository.model.Repository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "gitHubClient", url="${feign.base.url}")
public interface GitHubClient {

    @RequestMapping(method = RequestMethod.GET, value = "/users/{username}/repos")
    List<Repository> getUserRepositories(@PathVariable("username") String username);

    @RequestMapping(method = RequestMethod.GET, value = "/repos/{username}/{repo}/branches")
    List<Branch> getRepositoryBranches(@PathVariable("username") String username, @PathVariable("repo") String repo);

}
