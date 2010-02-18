/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS-IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.livingstories.server.rpcimpl;

/**
 * Stub implementation of a ServerCache that has a no-op for all the methods,
 * and never returns any results from its get() method.
 * 
 * This can be used to essentially disable the cache if you are running
 * the code against a system that doesn't have an existing cache implementation.
 * Replace the all ServerCache instances with this implementation to do so
 * (Currently only used by Caches.java)
 */
public class StubCacheImpl implements ServerCache {
  @Override
  public <T> T get(String key) {
    return null;
  }

  @Override
  public <T> void put(String key, T value) {
  }

  @Override
  public void remove(String key) {
  }
  
  @Override
  public void clear() {
  }
}
