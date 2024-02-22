fun main() {
    //TwoSum problem
    val nums: IntArray = intArrayOf(1,2,3,4,5);
    val target = 9

    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i != j && nums[i] + nums[j] == target) {
                println(i)
            }
        }
    }
}



