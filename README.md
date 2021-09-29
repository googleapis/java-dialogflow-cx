# Google Dialogflow CX Client for Java

Java idiomatic client for [Dialogflow CX][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

> Note: This client is a work-in-progress, and may occasionally
> make backwards-incompatible changes.


## Quickstart


If you are using Maven, add this to your pom.xml file:


```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-dialogflow-cx</artifactId>
  <version>0.10.1</version>
</dependency>
```

If you are using Gradle without BOM, add this to your dependencies

```Groovy
implementation 'com.google.cloud:google-cloud-dialogflow-cx:0.10.1'
```

If you are using SBT, add this to your dependencies

```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-dialogflow-cx" % "0.10.1"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Authorization

The client application making API calls must be granted [authorization scopes][auth-scopes] required for the desired Dialogflow CX APIs, and the authenticated principal must have the [IAM role(s)][predefined-iam-roles] required to access GCP resources using the Dialogflow CX API calls.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Dialogflow CX [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Dialogflow CX.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-dialogflow-cx` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-dialogflow-cx` as a dependency in your code.

## About Dialogflow CX


[Dialogflow CX][product-docs] provides a new way of designing agents, taking a state machine approach to agent design. This gives you clear and explicit control over a conversation, a better end-user experience, and a better development workflow.

See the [Dialogflow CX client library docs][javadocs] to learn how to
use this Dialogflow CX Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-dialogflow-cx/tree/master/samples) directory.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Create Agent | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/CreateAgent.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/CreateAgent.java) |
| Create Flow | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/CreateFlow.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/CreateFlow.java) |
| Create Intent | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/CreateIntent.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/CreateIntent.java) |
| Create Page | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/CreatePage.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/CreatePage.java) |
| Create Simple Page | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/CreateSimplePage.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/CreateSimplePage.java) |
| Delete Page | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/DeletePage.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/DeletePage.java) |
| Detect Intent | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/DetectIntent.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/DetectIntent.java) |
| Detect Intent Stream | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/DetectIntentStream.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/DetectIntentStream.java) |
| List Pages | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/ListPages.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/ListPages.java) |
| List Test Case Results | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/ListTestCaseResults.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/ListTestCaseResults.java) |
| Update Intent | [source code](https://github.com/googleapis/java-dialogflow-cx/blob/master/samples/snippets/src/main/java/dialogflow/cx/UpdateIntent.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow-cx&page=editor&open_in_editor=samples/snippets/src/main/java/dialogflow/cx/UpdateIntent.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Dialogflow CX uses gRPC for the transport layer.

## Supported Java Versions

Java 7 or above is required for using this client.

Google's Java client libraries,
[Google Cloud Client Libraries][cloudlibs]
and
[Google Cloud API Libraries][apilibs],
follow the
[Oracle Java SE support roadmap][oracle]
(see the Oracle Java SE Product Releases section).

### For new development

In general, new feature development occurs with support for the lowest Java
LTS version covered by  Oracle's Premier Support (which typically lasts 5 years
from initial General Availability). If the minimum required JVM for a given
library is changed, it is accompanied by a [semver][semver] major release.

Java 11 and (in September 2021) Java 17 are the best choices for new
development.

### Keeping production systems current

Google tests its client libraries with all current LTS versions covered by
Oracle's Extended Support (which typically lasts 8 years from initial
General Availability).

#### Legacy support

Google's client libraries support legacy versions of Java runtimes with long
term stable libraries that don't receive feature updates on a best efforts basis
as it may not be possible to backport all patches.

Google provides updates on a best efforts basis to apps that continue to use
Java 7, though apps might need to upgrade to current versions of the library
that supports their JVM.

#### Where to find specific information

The latest versions and the supported Java versions are identified on
the individual GitHub repository `github.com/GoogleAPIs/java-SERVICENAME`
and on [google-cloud-java][g-c-j].

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


It is currently in major version zero (``0.y.z``), which means that anything may change at any time
and the public API should not be considered stable.


## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.


## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/dialogflow/cx/docs
[javadocs]: https://googleapis.dev/java/google-cloud-dialogflow-cx/latest/index.html
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow-cx/java11.html
[stability-image]: https://img.shields.io/badge/stability-beta-yellow
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-dialogflow-cx.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-dialogflow-cx&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[auth-scopes]: https://developers.google.com/identity/protocols/oauth2/scopes
[predefined-iam-roles]: https://cloud.google.com/iam/docs/understanding-roles#predefined_roles
[iam-policy]: https://cloud.google.com/iam/docs/overview#cloud-iam-policy
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-dialogflow-cx/blob/master/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-dialogflow-cx/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-dialogflow-cx/blob/master/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=dialogflow-cx.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png

[semver]: https://semver.org/
[cloudlibs]: https://cloud.google.com/apis/docs/client-libraries-explained
[apilibs]: https://cloud.google.com/apis/docs/client-libraries-explained#google_api_client_libraries
[oracle]: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
[g-c-j]: http://github.com/googleapis/google-cloud-java
