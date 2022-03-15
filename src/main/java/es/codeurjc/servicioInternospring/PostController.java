package es.codeurjc.servicioInternospring;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

@RestController
public class PostController {
 @Autowired
 private PostService posts;
 @GetMapping("/posts/")
 public Collection<Post> getPosts() {
   return posts.findAll();
 }
}