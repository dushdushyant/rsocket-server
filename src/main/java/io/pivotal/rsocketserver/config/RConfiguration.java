package io.pivotal.rsocketserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.MimeTypeUtils;

import io.rsocket.RSocket;
import io.rsocket.RSocketFactory;
import io.rsocket.frame.decoder.PayloadDecoder;
import io.rsocket.transport.netty.client.TcpClientTransport;

@Configuration
public class RConfiguration {
	
//	@Bean
//	public RSocket rSocket() {
//		return RSocketFactory
//				.connect()
//				.mimeType(MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.APPLICATION_JSON_VALUE)
//				.frameDecoder(PayloadDecoder.ZERO_COPY)
//				.transport(TcpClientTransport.create(7000))
//				.start()
//				.block();
//	}

}
