class FoodRatings {
public:
    unordered_map<string,set<pair<int,string>>> cusinemapping;
    unordered_map<string,int> foodtorating;
    unordered_map<string,string> foodtocusine;
    FoodRatings(vector<string>& foods, vector<string>& cuisines, vector<int>& ratings) {
        for(int i=0;i<foods.size();i++){
            cusinemapping[cuisines[i]].insert({-ratings[i],foods[i]});
            foodtorating[foods[i]]=ratings[i];
            foodtocusine[foods[i]]=cuisines[i];
        }
    }
    
    void changeRating(string food, int newRating) {
        string cuisine=foodtocusine[food];
        int oldRating=foodtorating[food];
        cusinemapping[cuisine].erase({-oldRating,food});
        cusinemapping[cuisine].insert({-newRating,food});
        foodtorating[food]=newRating;

    }
    
    string highestRated(string cuisine) {
        return (*cusinemapping[cuisine].begin()).second;
    }
};

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings* obj = new FoodRatings(foods, cuisines, ratings);
 * obj->changeRating(food,newRating);
 * string param_2 = obj->highestRated(cuisine);
 */