# Copyright 2021 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import synthtool as s
from synthtool.languages import java


for library in s.get_staging_dirs():
    # put any special-case replacements here
    s.replace(
        '**/pom.xml',
        r'<maven.compiler.target>1.8</maven.compiler.target>',
        r'<maven.compiler.target>11</maven.compiler.target>'
    )
    s.replace(
        '**/pom.xml',
        r'<maven.compiler.source>1.8</maven.compiler.source>',
        r'<maven.compiler.source>11</maven.compiler.source>'
    )
    s.replace(
        '.kokoro/**/samples.cfg',
        r'gcr.io/cloud-devrel-kokoro-resources/java8',
        r'gcr.io/cloud-devrel-kokoro-resources/java11'
    )

    s.move(library)

s.remove_staging_dirs()
java.common_templates()
