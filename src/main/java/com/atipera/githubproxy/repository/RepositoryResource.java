package com.atipera.githubproxy.repository;

import com.atipera.githubproxy.commons.ErrorDTO;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RepositoryResource {

    private final RepositoryService repositoryService;

    public RepositoryResource(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @GetMapping(value = "/repositories", produces = { "application/json" })
    public ResponseEntity<Object> getUserRepositories(@RequestParam("username") String username) {
        try {
            return new ResponseEntity<>(repositoryService.getUserRepositories(username), HttpStatus.OK);
        } catch(FeignException ex) {
            return new ResponseEntity<>(new ErrorDTO(ex.status(), ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}
