package com.springfox.deprecated.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springfox.deprecated.sample.annotation.CurrentAnnotation;
import com.springfox.deprecated.sample.annotation.DeprecatedAnnotation;

@RestController
@RequestMapping(value = "/")
public class FooController {

    @DeprecatedAnnotation
    @RequestMapping(value = "/deprecated", method = RequestMethod.GET)
    public void deprecatedAnnotation() {
        System.out.println("Call to Deprecated");
    }
    
    @CurrentAnnotation
    @RequestMapping(value = "/notDeprecated", method = RequestMethod.GET)
    public void currentAnnotation() {
        System.out.println("Call to Not Deprecated");
    }
}
