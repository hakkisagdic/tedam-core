/*
 * Copyright 2014-2019 Logo Business Solutions
 * (a.k.a. LOGO YAZILIM SAN. VE TIC. A.S)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lbs.tedam.websocket.client;

import javax.websocket.CloseReason;
import javax.websocket.Session;
import java.io.Serializable;

/**
 * Base listener for web socket clients.
 */
public interface WebSocketClientListener extends Serializable {

    /**
     * This method will be called when a web socket session is opened.
     *
     * @param session Session info on web socket session.
     */
    public void onOpen(Session session);

    /**
     * This method will be called when a web socket session is closed.
     *
     * @param session     Session info on web socket session.
     * @param closeReason Close reason for why session is closed.
     */
    public void onClose(Session session, CloseReason closeReason);

    /**
     * This method will be called when a web socket session received a message.
     *
     * @param message String message that is received on session.
     */
    public void onMessage(String message);

    /**
     * This method will be called when a web socket session received an error.
     *
     * @param error Error instance.
     */
    public void onError(Throwable error);

}
