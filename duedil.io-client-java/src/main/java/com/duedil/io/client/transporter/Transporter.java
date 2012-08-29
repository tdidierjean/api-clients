/**
 * DuedilApiClient
 * @copyright 2012 Duedil Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.duedil.io.client.transporter;

import com.duedil.io.client.domain.Request;
import com.duedil.io.client.exception.DuedilClientException;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.transporter
 */
public interface Transporter {

    /**
     * Call the RESTFull Endpoint
     *
     * @param request The object that rappresent the User Request
     *
     * @return string The response (json format)
     *
     * @throws DuedilClientException
     */
    public String getData(Request request) throws DuedilClientException;

}
