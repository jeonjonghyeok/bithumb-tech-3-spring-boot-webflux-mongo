package jjh.api.item;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ItemService {
    Optional<Item> findById(long id);
}
