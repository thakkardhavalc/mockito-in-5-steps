package com.in28minutes.mockito.mockitoin5steps.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
public class ListTest {
    @Test
    void simpleTest() {

        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(3);

        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturnsTest() {

        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(1).thenReturn(2);

        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    void parametersTest() {

        List listMock = mock(List.class);

        when(listMock.get(0)).thenReturn("Some String");

        assertEquals("Some String", listMock.get(0));
        assertNull(listMock.get(1));
    }

    @Test
    void genericParametersTest() {

        List listMock = mock(List.class);

        when(listMock.get(Mockito.anyInt())).thenReturn("Some Other String");

        assertEquals("Some Other String", listMock.get(0));
        assertEquals("Some Other String", listMock.get(1));
    }
}
