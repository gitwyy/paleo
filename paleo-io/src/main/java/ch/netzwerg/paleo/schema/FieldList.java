/*
 * Copyright 2016 Rahel Lüthy
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

package ch.netzwerg.paleo.schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class to work around the fact that the JSON (de)serializer is not able to infer
 * type information of <code>List&lt;Field&gt;</code> due to Java's type erasure.
 */
@SuppressWarnings("unused") // needed for JSON (de)serialization
public final class FieldList extends ArrayList<Field> {

    public FieldList() {
    }

    public FieldList(List<Field> fields) {
        super(fields);
    }

}
