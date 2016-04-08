/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Monument.Dario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author wolos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.Monument.Dario.QuadradoTest.class, com.Monument.Dario.TorreArkTest.class, com.Monument.Dario.Main_ArkTest.class, com.Monument.Dario.MainTest.class})
public class DarioSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
