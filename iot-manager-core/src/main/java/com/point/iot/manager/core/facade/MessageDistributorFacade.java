package com.point.iot.manager.core.facade;

import java.util.Map;


/**
 * @author langxianwei
 * 
 */
public interface MessageDistributorFacade {
	Map<Integer, MessageDistributorLogicHandler> getFacadeMap();
}