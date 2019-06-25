package org.camunda.connect.dxp_https_connector;

import java.util.logging.Logger;

import org.camunda.connect.httpclient.HttpConnector;
import org.camunda.connect.spi.ConnectorConfigurator;

public class HttpConnectorConfigurator implements ConnectorConfigurator<HttpConnector> {

	private static final Logger LOGGER = Logger.getLogger("");

	public Class<HttpConnector> getConnectorClass() {
		return HttpConnector.class;
	}

	public void configure(HttpConnector connector) {
		LOGGER.info("--------------Reading Config-----------------------");
	}

}
