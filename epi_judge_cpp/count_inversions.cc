#include <vector>
#include "test_framework/generic_test.h"

using std::vector;

int CountInversions(vector<int> A) {
  // Implement this placeholder.
  return 0;
}

int main(int argc, char* argv[]) {
  std::vector<std::string> args{argv + 1, argv + argc};
  std::vector<std::string> param_names{"A"};
  return GenericTestMain(args, "count_inversions.tsv", &CountInversions,
                         DefaultComparator{}, param_names);
}
