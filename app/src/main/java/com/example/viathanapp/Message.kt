package com.example.viathanapp
import com.pusher.rest.Pusher
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


    data class Message(var user:String,
                       var message:String,
                       var time:Long)

    //`MessageController.kt` is a REST controller that defines a POST endpoint to publish the received message object to a Pusher channel (`chat`):



    @RestController
    @RequestMapping("/message")
    class MessageController {
        private val pusher = Pusher("1176428", "b279148aba3bbd58da42", "9f4219a22bd739df6cd0")

        init {
            pusher.setCluster("eu")
        }

        @PostMapping
        fun postMessage(@RequestBody message: Message) : ResponseEntity<Unit> {
            pusher.trigger("chat", "new_message", message)
            return ResponseEntity.ok().build()
        }
    }
