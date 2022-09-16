/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
const minSubArrayLen = function (target, nums) {
  let sum = 0;
  let pointB = 0;
  let indexNums = [];
  let indexNumsLength = 0;
  for (let index = 0; index < nums.length; index++) {
    sum += nums[pointB];
    while (pointB < nums.length) {
      if (sum != target) {
        pointB++;
      } else if (sum >= target) {
        indexNumsLength = pointB - index + 1;
        indexNums.push(indexNumsLength);
        break;
      }
    }
  }
  return indexNums;
};
const target = 7;
const nums = [2, 3, 1, 2, 4, 3];
const ans = minSubArrayLen(target, nums);
console.log(ans);
