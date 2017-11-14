List<String> list = new ArrayList<>();
list.add("abc");
list.add("abd");
list.add("bcd");
//list排序
Collections.sort(list);
//自定义排序方式，重写Comparator
Collections.sort(list, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
