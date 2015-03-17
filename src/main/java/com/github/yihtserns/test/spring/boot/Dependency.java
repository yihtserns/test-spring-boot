/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.yihtserns.test.spring.boot;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author yihtserns
 */
public class Dependency {

    @Value("${config.limit}")
    private int limit;

    public int getLimit() {
        return limit;
    }
}
