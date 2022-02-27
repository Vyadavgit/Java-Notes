package day28;

import java.util.*;
import java.util.logging.Logger;

public class SmallCollectionPractice {
    public static void main(String[] args){
        final Collection<String> names = new ArrayList<>();
        names.add("ABC");
        names.add("ABC");
        names.add("ABC");

        Logger.getGlobal().info((names.toString())); // INFO: [ABC, ABC, ABC]

        List<String> immutableNames = List.of("ABC", "ABC", "ABC");
        // immutableNames.add("ashsdghs");
        Logger.getGlobal().info(immutableNames.toString()); // INFO: [ABC, ABC, ABC]

        Set<Integer> numbers = Set.of(2,3,5);

        ArrayList<String> mutableNames = new ArrayList<>(immutableNames);
        mutableNames.add("ABC");
        Logger.getGlobal().info(mutableNames.toString()); // INFO: [ABC, ABC, ABC, ABC]

        List<String> settings = Collections.nCopies(100, "DEFAULT");

        Collections.unmodifiableCollection(names);

        Collection<String> synchronizedNames = Collections.synchronizedCollection(names);
    }
}
