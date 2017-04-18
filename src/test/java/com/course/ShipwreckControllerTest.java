package com.course;

import com.course.controller.ShipwreckController;
import com.course.model.Shipwreck;
import com.course.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void ShipwreckGet(){
        Shipwreck shipwreck = new Shipwreck();
        shipwreck.setId(3L);
        when(shipwreckRepository.findOne(3L)).thenReturn(shipwreck);

        Shipwreck wreck = shipwreckController.get(3L);
        verify(shipwreckRepository).findOne(3L);
        assertEquals(3L, wreck.getId().longValue());
    }

}
