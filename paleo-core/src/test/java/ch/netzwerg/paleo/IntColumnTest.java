/*
 * Copyright 2015 Rahel Lüthy
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

package ch.netzwerg.paleo;

import org.junit.Test;

import static ch.netzwerg.paleo.ColumnIds.IntColumnId;
import static ch.netzwerg.paleo.ColumnIds.intCol;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IntColumnTest {

    @Test
    public void builder() {
        IntColumnId id = intCol("test");
        IntColumn column = IntColumn.builder(id).add(42).addAll(33, 69).add(99).build();
        assertEquals(id, column.getId());
        assertEquals(4, column.getRowCount());
        assertEquals(42, column.getValueAt(0));
        assertEquals(99, column.getValueAt(column.getRowCount() - 1));
        assertArrayEquals(new int[]{42, 33, 69, 99}, column.getValues().toArray());
    }

}