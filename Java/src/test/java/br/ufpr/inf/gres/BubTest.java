/*
 * Copyright 2016 Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.ufpr.inf.gres;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class BubTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_1() {
        Bub instance = new Bub();
        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_2() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_3() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_4() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_5() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_6() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_7() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);
        instance.bubbleSort();

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_8() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_9() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_10() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_11() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_12() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);
        instance.bubbleSort();

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_13() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_14() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_15() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_16() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_17() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_18() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_19() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_20() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_21() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_22() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_23() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_24() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_25() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_26() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_27() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_28() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_29() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_30() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_31() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_32() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_33() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_34() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_35() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_36() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_37() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_38() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_39() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_40() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_41() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_42() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_43() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_44() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_45() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_46() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_47() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_48() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_49() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_50() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_51() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_52() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_53() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_54() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_55() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_56() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_57() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_58() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_59() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_60() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_61() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_62() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_63() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_64() {

        Bub instance = new Bub();

        int arg1 = -1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_65() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_66() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_67() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_68() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_69() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_70() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_71() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_72() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_73() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_74() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_75() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_76() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_77() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_78() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_79() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_80() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_81() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_82() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_83() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_84() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_85() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_86() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_87() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_88() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_89() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_90() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_91() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_92() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_93() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_94() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_95() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_96() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_97() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_98() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_99() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_100() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_101() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_102() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_103() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_104() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_105() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_106() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_107() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_108() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_109() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_110() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_111() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_112() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_113() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_114() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_115() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_116() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_117() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_118() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_119() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_120() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_121() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_122() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_123() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_124() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_125() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_126() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_127() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_128() {

        Bub instance = new Bub();

        int arg1 = 0;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_129() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_130() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_131() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_132() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_133() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_134() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_135() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_136() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_137() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_138() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_139() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_140() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_141() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_142() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_143() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_144() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_145() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_146() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_147() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_148() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_149() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_150() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_151() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_152() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_153() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_154() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_155() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_156() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_157() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_158() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_159() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_160() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_161() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_162() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_163() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_164() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_165() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_166() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_167() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_168() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_169() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_170() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_171() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_172() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_173() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_174() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_175() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_176() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_177() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_178() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_179() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_180() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_181() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_182() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_183() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_184() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_185() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_186() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_187() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_188() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_189() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_190() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_191() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_192() {

        Bub instance = new Bub();

        int arg1 = 1;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_193() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_194() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_195() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_196() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_197() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_198() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_199() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_200() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_201() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_202() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_203() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_204() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_205() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_206() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_207() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_208() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = -1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_209() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_210() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_211() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_212() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_213() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_214() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_215() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_216() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_217() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_218() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_219() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_220() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_221() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_222() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_223() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_224() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 0;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_225() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_226() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_227() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_228() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_229() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_230() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_231() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_232() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_233() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_234() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_235() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_236() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_237() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_238() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_239() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_240() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 1;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_241() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_242() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_243() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_244() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = -1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_245() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_246() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_247() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_248() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 0;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_249() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_250() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_251() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_252() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 1;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTS_1_253() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = -1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_254() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 0;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_255() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 1;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_256() {

        Bub instance = new Bub();

        int arg1 = 2;
        instance.add(arg1);
        int arg2 = 2;
        instance.add(arg2);
        int arg3 = 2;
        instance.add(arg3);
        int arg4 = 2;
        instance.add(arg4);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertEquals(expected, instance.getVector());
    }

    @Test
    public void testTS_1_257() {

        Bub instance = new Bub();

        instance.add(54);
        instance.add(26);
        instance.add(93);
        instance.add(17);
        instance.add(77);
        instance.add(31);
        instance.add(44);
        instance.add(55);
        instance.add(20);

        ArrayList<Integer> expected = new ArrayList(instance.getVector());
        Collections.sort(expected);

        instance.bubbleSort();

        assertSame(expected.get(4), instance.get(4));
    }

    @Test
    public void testTS_1_258() {

        Bub instance = new Bub();

        instance.add(54);
        instance.add(26);
        instance.add(93);
        instance.add(17);
        instance.add(77);
        instance.add(31);
        instance.add(44);
        instance.add(55);
        instance.add(20);

        assertSame(9, instance.size());
    }

    @Test
    public void testTS_1_259() {
        try {
            Bub instance = new Bub();

            instance.add(54);
            instance.add(26);
            instance.add(93);
            instance.add(17);
            instance.add(77);
            instance.add(31);
            instance.add(44);
            instance.add(55);
            instance.add(20);

            Class<?> bubClass = instance.getClass();

            // Get all the method names
            ArrayList<Method> methods = new ArrayList<>(Arrays.asList(bubClass.getDeclaredMethods()));
            Method swapMethod = methods.stream().filter(p -> p.getName().equals("swap")).findFirst().get();
            swapMethod.setAccessible(true);
            swapMethod.invoke(instance, new Object[]{0, 1});
            assertSame(54, instance.get(1));
        } catch (IllegalArgumentException | SecurityException | IllegalAccessException | InvocationTargetException e) {
            assertTrue(false);
        }
    }

    @Test
    public void testTS_1_260() {
        Bub instance = new Bub();
        instance.bubbleSort();
        assertSame(0, instance.size());
    }  
}
