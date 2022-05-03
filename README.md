<<<<<<< HEAD
![LUSID by Finbourne](https://content.finbourne.com/LUSID_repo.png)

# ${REPO_NAME}

## Getting Started

## Contributing

We welcome community participation in our tools. For information on contributing see our article [here](/finbourne/${REPO_NAME}/docs)

## Reporting Issues
If you encounter any issues please report these the Github [issues page](https://github.com/finbourne/${REPO_NAME}/issues).

---

# TODOs

- [ ] update repo name in template
- [ ] set up [GitHub Actions](https://docs.github.com/en/actions) automated build
- [ ] set up [SonarCloud](https://sonarcloud.io/organizations/finbourne/projects) build
- [ ] add quickstart install documentation to the README
- [ ] add setup/install documentation to the Wiki

## Update repo name

Update the `${REPO_NAME}` to the repo name in the following:
* `README.md`
* `.github/bug_report.md`

## Add badges
* version
* build status
* GitHub Actions
* SonarCloud build

e.g.

![PyPI](https://img.shields.io/pypi/v/lusidtools?color=blue)
[![Build Status](https://travis-ci.org/finbourne/lusid-python-tools.svg?branch=master)](https://travis-ci.org/finbourne/lusid-python-tools)
![](https://github.com/finbourne/lusid-python-tools/workflows/commit-hook/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=finbourne_lusid-python-tools&metric=alert_status)](https://sonarcloud.io/dashboard?id=finbourne_lusid-python-tools)

```
![PyPI](https://img.shields.io/pypi/v/lusidtools?color=blue)
[![Build Status](https://travis-ci.org/finbourne/lusid-python-tools.svg?branch=master)](https://travis-ci.org/finbourne/lusid-python-tools)
![](https://github.com/finbourne/lusid-python-tools/workflows/commit-hook/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=finbourne_lusid-python-tools&metric=alert_status)](https://sonarcloud.io/dashboard?id=finbourne_lusid-python-tools)
=======
![LUSID_by_Finbourne](https://content.finbourne.com/LUSID_repo.png)


# LUSID<sup>®</sup> CHANGEME-APPLICATION-CAMEL Java SDK Preview

The CHANGEME-APPLICATION-CAMEL application is part of the [LUSID by FINBOURNE](https://www.finbourne.com/lusid-technology) platform. To use it you'll need a LUSID account. [Sign up for free at lusid.com](https://www.lusid.com/app/signup).

For more details on other applications in the LUSID platform, see [Understanding all the applications in the LUSID platform](https://support.lusid.com/knowledgebase/article/KA-01787/en-us).

[C# SDK Extensions](https://github.com/finbourne/CHANGEME-APPLICATION-LOWER-sdk-extensions-csharp) to accompany this SDK are available. These provides the user with additional extensions to make it easy to configure and use the API endpoints.

## Installation

Maven artifacts can be downloaded from the Open Source Software Repository Hosting (OSSRH) by adding the following to your pom.xml

```
<project>
  ...
  <repositories>
    <repository>
      <id>osssrh</id>
      <name>OSSRH</name>
      <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.finbourne</groupId>
      <artifactId>CHANGEME-APPLICATION-LOWER-sdk-preview</artifactId>
      <version>{INSERT VERSION}</version>
    </dependency>
    ...
  </dependencies>
  ...
</project>
>>>>>>> b6df8b8 (Initialize feature/CTECH-1180)
```