As an api consumer, given username and header “Accept: application/json”, I would like to list all his github repositories, which are not forks. Information, which I require in the response, is:



Repository Name

Owner Login

For each branch it’s name and last commit sha



As an api consumer, given not existing github user, I would like to receive 404 response in such a format:

{

    “status”: ${responseCode}

    “message”: ${whyHasItHappened}

}

Endpoint is available at /repositories?username=[GitHub User]
Example response:

[
    {
        "name": "arduinoSumo",
        "owner": {
            "login": "Roger1121"
        },
        "branches": [
            {
                "name": "master",
                "commit": {
                    "sha": "ef7cec4bce6d031d12022e9bab8828364fe7ef90"
                }
            }
        ]
    },
    {
        "name": "OBDScanner",
        "owner": {
            "login": "Roger1121"
        },
        "branches": [
            {
                "name": "master",
                "commit": {
                    "sha": "78478fc9408a59509ab2518e4290f332f6bf7f67"
                }
            }
        ]
    },
    {
        "name": "ProjektSieciKomputerowej",
        "owner": {
            "login": "Roger1121"
        },
        "branches": [
            {
                "name": "master",
                "commit": {
                    "sha": "5be124b89fa1451b9f5e90dff45df10752a98ef0"
                }
            }
        ]
    },
    {
        "name": "Projekt_ZSSI",
        "owner": {
            "login": "Roger1121"
        },
        "branches": [
            {
                "name": "main",
                "commit": {
                    "sha": "c2528435fe0aeb6cb8a7d523a06a9de0282228e3"
                }
            },
            {
                "name": "net_proto",
                "commit": {
                    "sha": "11fd0c33909d2f2d90d17e85dd2c0bfc7c42f118"
                }
            }
        ]
    },
    {
        "name": "TeaLearn",
        "owner": {
            "login": "Roger1121"
        },
        "branches": [
            {
                "name": "main",
                "commit": {
                    "sha": "857878c0b626f9def35fd40195e6fba477deb9fc"
                }
            },
            {
                "name": "memento",
                "commit": {
                    "sha": "7ffaa9f3357b0a8cf58211a0ec6b1e44d047f84b"
                }
            }
        ]
    }
]
