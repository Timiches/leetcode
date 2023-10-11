class t135_Candy {
public:
    int candy(vector<int>& ratings) {
        int n = ratings.size();
        int ans = 1;
        int up = 0, down = 0, peak = 0;
         for (int i = 1; i <n; i++) {
            if (ratings[i-1] < ratings[i]) {
                peak = ++up;
                down = 0;
                ans+= 1 + peak;
            }
            else if (ratings[i-1] == ratings[i])  {
                peak = up = down = 0;
                ans++;
            }
            else {
                up = 0;
                down++;
                ans += (peak<down) ? down + 1 : down;
            }
        }
        return ans;
    }
};