/*
    Copyright 2010, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.restx.exception;

import org.jboss.netty.handler.codec.http.HttpResponseStatus;

import com.strategicgains.restx.exception.ServiceException;

/**
 * @author toddf
 * @since Jun 28, 2010
 */
public class ForbiddenException
extends ServiceException
{
    private static final long serialVersionUID = -8484662487466021563L;
	private static final HttpResponseStatus STATUS = HttpResponseStatus.FORBIDDEN;

	public ForbiddenException()
	{
		super(STATUS);
	}

	/**
	 * @param message
	 */
	public ForbiddenException(String message)
	{
		super(STATUS, message);
	}

	/**
	 * @param cause
	 */
	public ForbiddenException(Throwable cause)
	{
		super(STATUS, cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ForbiddenException(String message, Throwable cause)
	{
		super(STATUS, message, cause);
	}
}
