package com.controller.matrix;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/matrix")
public class MatrixController {

    /// matrix/matrixvars;foo=bar/simple
    @RequestMapping(value = "{path}/simple", method = RequestMethod.GET)
    public  String withMatrixVariable(
            @PathVariable String path,
            @MatrixVariable(value = "foo", pathVar = "path") String foo,
            BindingResult bindingResult) {

//        if(bindingResult.hasErrors()) {
//            return bindingResult.getAllErrors().toString();
//        }else {
            return "'foo=" + foo + "' from  '" + path + "'";
//        }


    }

    // account;ids=12,45,9
    @RequestMapping(value = "/account;{ids}", method = RequestMethod.GET)
    public @ResponseBody String withMatrixVariablesAndAssembleToMap(
            @MatrixVariable(pathVar = "ids") Map<String, String> paths) {

        return "Obtained matrix variable (map) : " + paths;
    }
}
