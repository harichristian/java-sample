package moba.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by hc on 4/6/15.
 */
public class Redis2_7_0Test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6378);
        jedis.select(6);
        String value = jedis.get("PIXEL::COUNT");
        System.out.println("VALUE3 = " + value);
        jedis.close();
    }
}