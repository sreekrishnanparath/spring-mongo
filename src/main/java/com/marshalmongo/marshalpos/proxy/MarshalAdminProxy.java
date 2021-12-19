package com.marshalmongo.marshalpos.proxy;


import com.marshalmongo.marshalpos.bean.Parameters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="marshal-admin",url="localhost:8081/marshalpadmin")
@FeignClient(name="MARSHAL-ADMIN") //with eureka no need hardcoded url
public interface MarshalAdminProxy {

    @GetMapping("/parameters/{applicationCode}")
    public Parameters getParameters(@PathVariable String applicationCode);



}
