package xyz.zhangyi.diamond.demo.ordercontext.southbound.port.repositories;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@Repository
@Port(PortType.Repository)
public interface OrderRepository {
    void add(Order order);
}
