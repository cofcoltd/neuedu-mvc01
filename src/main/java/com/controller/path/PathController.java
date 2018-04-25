package com.controller.path;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("path")
public class PathController {

    //
    @GetMapping("/owners/{ownerId}/pets/{petId}")
    public String withMatrixVariablesMultiple3(
            @PathVariable("ownerId") int ownerId,
            @PathVariable("petId") int petId) {

        StringBuilder msg = new StringBuilder();
        msg.append("ownerId : ").append(ownerId).append(" . ");
        msg.append("petId : ").append(petId).append(" . ");

        return msg.toString();
    }
}
