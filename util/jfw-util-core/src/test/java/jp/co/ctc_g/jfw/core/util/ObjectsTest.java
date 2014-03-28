/*
 * Copyright (c) 2013 ITOCHU Techno-Solutions Corporation.
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

package jp.co.ctc_g.jfw.core.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectsTest {

    @Test
    public void equals() {

        Integer a = new Integer(1);
        Integer b = new Integer(2);
        assertThat(Objects.equals(a, b), is(false));
        assertThat(Objects.equals(null, null), is(true));
        assertThat(Objects.equals(a, null), is(false));
        assertThat(Objects.equals(null, b), is(false));

    }

}