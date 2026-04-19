package vn.fpoly.demo100.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {
MyUtil myUtil = new MyUtil();
    @Test
    void tinhtongmang() {
        assertEquals(100,myUtil.tinhtongmang(new int[]{99,1}));
    }

    @Test
    void tinhtongmangwithnull(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->myUtil.tinhtongmang(null));
        assertEquals("null",exception.getMessage());
    }
    @Test
    void tinhtongmangphantu0(){
        assertEquals(0,myUtil.tinhtongmang(new int[]{}));
    }
}