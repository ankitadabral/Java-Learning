
package Collection_Framework.Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

// IdentityHashMap uses the == operator for key comparison instead of the equals() method,
// unlike HashMap.
//
// In HashMap, keys are compared using their hashCode() and equals() methods.
// If two keys are logically equal means content is same, the new value replaces the old value.
//
// However, IdentityHashMap works differently. It uses the == operator,
// which checks whether two references point to the exact same object.
//
// If both references point to the same object, the existing value is updated.
// But if they point to different objects, even if their contents are the same,
// IdentityHashMap treats them as two separate keys.

// The same difference applies to hash code generation.
// IdentityHashMap uses System.identityHashCode() instead of the key's overridden hashCode() method.
//
// This means that even if a class (such as String or Integer) has its own
// hashCode() implementation, IdentityHashMap uses the identity-based hash code.
//
// System.identityHashCode() generates a hash code based on object identity,
// not the object's content.
//
// Different objects may have the same identity hash code, although this is uncommon.
// Therefore, we should not assume that different objects always have different hash codes.
// The hash code is also not the same as the internal bucket index.
public class IdentityHashMapDemo {
    public static void main(String[] args) {

        // Here, we are creating two String objects using the new keyword.
        // This creates two separate objects with different references.
        String key1 = new String("key");
        String key2 = new String("key");

        // Here, we are printing the identity hash codes of both objects.
        // These hash codes are generated using System.identityHashCode().
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        // Here, we are printing the regular hash codes of both String objects.
        // String overrides the hashCode() method to generate hash codes based on content.
        // Since both strings have the same content, their hash codes will be the same.
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println("Print map:" + map);
    }
}
