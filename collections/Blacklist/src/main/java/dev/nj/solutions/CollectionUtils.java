package dev.nj.solutions;

import java.util.Collection;

public class CollectionUtils {
    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        return phones.stream().filter(e -> !blacklist.contains(e)).toList();
    }

    public static Collection<String> filterPhonesCollectionRemove(Collection<String> phones,
                                                           Collection<String> blacklist) {
        // phones.removeAll(blacklist);
        phones.removeIf(blacklist::contains);
        return phones;
    }
}
