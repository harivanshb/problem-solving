class Solution {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
         Arrays.sort(products);
        Set<String> prefix = new TreeSet<>();
        List<List<String>> result = new ArrayList<>();

        int i = 0;
        int j = searchWord.length();
        while (j > 0) {
            prefix.add(searchWord.substring(i, j));
            j--;
        }
        System.out.println(prefix);
        for (String p : prefix) {
            List<String> toBeAdded = new ArrayList<>();
            for (String product : products) {
                if (product.startsWith(p) && toBeAdded.size()<3) {
                    toBeAdded.add(product);
                }
            }
            result.add(toBeAdded);
        }
        return result;
    }
}
