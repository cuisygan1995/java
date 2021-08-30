package collectionLearn.arrayListSource;

import java.util.ArrayList;

public class arrayListSource {
    public static void main(String[] args) {
        // 使用无参数构造器
        ArrayList<Object> objects = new ArrayList<>(); //初始化无参构造器
        for (int i = 0; i < 10; i++) { //存在装箱
            objects.add(i);

            // add方法源码
//i            public boolean add(E e) {
//                ensureCapacityInternal(size + 1);  // Increments modCount!!   //先确定是否要扩容，enter进入查看
//                elementData[size++] = e;                                      //然后在执行赋值
//                return true;

            // ensureCapacityInternal源码
//            private void ensureCapacityInternal(int minCapacity) {
//                ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
//            }

            // calculateCapacity源码
//            private static int calculateCapacity(Object[] elementData, int minCapacity) {
//                if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
//                    return Math.max(DEFAULT_CAPACITY, minCapacity);                      //空数组，扩容成10
//                }
//                return minCapacity;
//            }


            // ensureExplicitCapacity源码
//            private void ensureExplicitCapacity(int minCapacity) {                      //再次确认是否要扩容
//                modCount++;
//
//                // overflow-conscious code
//                if (minCapacity - elementData.length > 0)
//                    grow(minCapacity);                                                  // grow方法是真正去扩容的方法
//            }

            }
        }
}
