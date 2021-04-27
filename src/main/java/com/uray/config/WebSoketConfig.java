package com.uray.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @ClassName: WebSoketConfig
 * @Author: uray
 * @Date: 2021-04-27 10:53
 **/
@Configuration
@EnableWebSocketMessageBroker //启用我们的WebSocket服务器
public class WebSoketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // 客户端使用的websocket端点，SockJS 为了浏览器适配
        registry.addEndpoint("/ws").withSockJS();
    }

    public void configureMessageBroker(MessageBrokerRegistry registry){
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");

        // Use this for enabling a Full featured broker like RabbitMQ
//        registry.enableStompBrokerRelay("/topic")
//                .setRelayHost("localhost")
//                .setRelayPort(61613)
//                .setClientLogin("guest")
//                .setClientPasscode("guest");
    }

}
