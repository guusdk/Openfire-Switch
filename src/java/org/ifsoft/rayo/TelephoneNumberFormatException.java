/**
 * $Revision $
 * $Date $
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ifsoft.rayo;

public class TelephoneNumberFormatException extends Exception{

    public TelephoneNumberFormatException(String message) {
        super(message);
    }

    public TelephoneNumberFormatException(Throwable cause){
        super(cause.toString());
        super.initCause(cause);
    }

    public TelephoneNumberFormatException(String message, Throwable cause){
        super(message);
        super.initCause(cause);
    }

}

