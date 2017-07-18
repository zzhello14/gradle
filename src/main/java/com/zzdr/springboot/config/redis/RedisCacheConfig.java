package com.zzdr.springboot.config.redis;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

// @Configuration
// @EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {

	@Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate) {
		RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
		//redisCacheManager.setDefaultExpiration(5);
		return redisCacheManager;
	}

	//@Bean
	/*
	 * public RedisTemplate<?, ?> redisTemplate(RedisConnectionFactory factory)
	 * { StringRedisTemplate template = new StringRedisTemplate(factory);
	 * Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new
	 * Jackson2JsonRedisSerializer(Object.class); ObjectMapper om = new
	 * ObjectMapper(); om.setVisibility(PropertyAccessor.ALL,
	 * JsonAutoDetect.Visibility.ANY);
	 * om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
	 * jackson2JsonRedisSerializer.setObjectMapper(om);
	 * template.setValueSerializer(jackson2JsonRedisSerializer);
	 * template.afterPropertiesSet(); return template; }
	 */

	//@Bean
	/*
	 * public KeyGenerator keyGenerator() { return new KeyGenerator() {
	 * 
	 * @Override public Object generate(Object target, Method method, Object...
	 * params) { StringBuilder sb = new StringBuilder();
	 * //sb.append(target.getClass().getName()); //sb.append(method.getName());
	 * sb.append("sms:"); for (Object obj : params) {
	 * sb.append(obj.toString()).append(","); } if (sb.toString().endsWith(","))
	 * { return sb.substring(0, sb.length() - 1); }
	 * System.out.println(sb.toString()); return sb.toString(); } }; }
	 */
}
