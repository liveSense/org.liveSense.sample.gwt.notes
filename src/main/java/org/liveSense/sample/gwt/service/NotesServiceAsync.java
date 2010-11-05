/*
 *  Copyright 2010 Robert Csakany <robson@semmi.se>.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

/**
 *
 * @author Robert Csakany (robson@semmi.se)
 * @created Feb 12, 2010
 */
package org.liveSense.sample.gwt.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * This is the asynchronous service interface as required for GWT RPC operations.
 *
 * @see org.apache.sling.extensions.gwt.sample.client.NotesService
 * @see org.apache.sling.extensions.gwt.sample.client.Notes
 * @see org.apache.sling.extensions.gwt.sample.server.NotesServiceImpl
 */
public interface NotesServiceAsync {

    void createNote(Note note, AsyncCallback async);

    void getNotes(AsyncCallback async);

    void deleteNote(String path, AsyncCallback async);
}
