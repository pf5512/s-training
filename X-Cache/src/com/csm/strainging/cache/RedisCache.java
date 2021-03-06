package com.csm.strainging.cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * @author chensongming
 */
public class RedisCache {
	
	private RedisPool rp;
	
	public RedisCache(RedisPool rp) {
		this.rp = rp;
	}
	
	/** single key **/
	public void set(String key, String value) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			jedis.set(key, value);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}
	
	public void setex(String key, String value, int seconds) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			jedis.setex(key, seconds, value);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}
	
	public void del(String key) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			jedis.del(key);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}
	
	public String get(String key) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			return jedis.get(key);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}
	
	public void expire(String key, int seconds) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			jedis.expire(key, seconds);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}	
	
	/** hash key **/
	public String hget(String key, String field) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			return jedis.hget(key, field);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}

	public void hdel(String key, String field) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			jedis.hdel(key, field);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}
	
	public void hset(String key, String field, String value) {
		JedisPool jp = rp.getMaster();
		Jedis jedis = jp.getResource();
		try {
			jedis.hset(key, field, value);
		} catch (Exception e) {
			jp.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				jp.returnResource(jedis);
			}
		}
	}
	
	public long zadd(String key, double score, String member) {
		JedisPool pool = rp.getMaster();
		Jedis jedis = pool.getResource();
		try {
			return jedis.zadd(key, score, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				pool.returnResource(jedis);
			}
		}
	}
	
	public long zremrangeByScore(String key, double start, double end) {
		JedisPool pool = rp.getMaster();
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByScore(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				pool.returnResource(jedis);
			}
		}
	}
	
	public long zrem(String key, String member) {
		JedisPool pool = rp.getMaster();
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrem(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				pool.returnResource(jedis);
			}
		}
	}
	
	public Double zscore(String key, String member) {
		JedisPool pool = rp.getMaster();
		Jedis jedis = pool.getResource();
		try {
			return jedis.zscore(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			jedis = null;
			throw new RuntimeException(e);
		} finally {
			if (jedis != null) {
				pool.returnResource(jedis);
			}
		}
	}
	

}
