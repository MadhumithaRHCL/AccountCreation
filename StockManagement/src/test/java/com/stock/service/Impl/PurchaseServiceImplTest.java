package com.stock.service.Impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.stock.repository.PurchaseRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PurchaseServiceImplTest {
	
	@Mock
	PurchaseRepository purchaseRepository;
	
	@InjectMocks
	PurchaseServiceImpl purchaseServiceImpl;
	
	@Before
	public void before()
	{
		
	}
	
	@Test
	public void testGetPurchaseDetails()
	{
		
	}

}
