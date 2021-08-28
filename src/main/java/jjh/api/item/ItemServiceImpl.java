package jjh.api.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
    @Override
    public Optional<Item> findById(long id) {
        return itemRepository.findById(id);
    }
}
