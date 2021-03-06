/*
 * Copyright 2013 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire;

import com.squareup.javapoet.JavaFile;
import com.squareup.kotlinpoet.FileSpec;
import java.nio.file.Path;

interface WireLogger {
  void setQuiet(boolean quiet);
  void artifact(Path outputPath, JavaFile javaFile);
  void artifact(Path outputPath, FileSpec kotlinFile);
  void info(String message);
}
