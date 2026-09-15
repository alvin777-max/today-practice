'use strict';

//함수를 간단하게 만드는 방법, but 동작이 완전히 같지는 않음
//화살표 함수와 일반함수의 차이
//callback 안에서 this 사용시의 차이

const prices = [1000, 2000, 3000];

// map->콜백함수에서의 return값을 가지고 새로운 배열 만듬

const regularPrices = prices.map(function(price) {
    return price * 2;
});

console.log(regularPrices);

const arrowPrices = prices.map(price => price * 2) ;
console.log(arrowPrices);

const theater = {
    store: '청량리역점',
    titles: ['오디세이', '옵세션'],

    showMovieList: function() {
        console.log(this);      //this: theater // 일반함수로 작성해야 theater을 this로 사용

    // showMovieList: () => {
    //     console.log(this);
    // }

        // 화살표 함수는 자신만의 this가 없고, 바깥 범위의 this를 사용한다
        this.titles.forEach(title => {              //this.title.foreach의 this와 console.log안의 this는 같은 this
            console.log(this.store + ':' + title); //title은 foreach가 전달해준 배열값 
            //this.store은 showMovieList: function() {console.log(this) 의 this를 사용했음. foreach가 전달해준게 아님,showmovieList의 this 사용
        });

        // this.titles.forEach(function(title) {
        //     console.log(this.store + ':' + title);  // TypeError: Cannot read properties of undefined (reading 'store') 바깥메서드의 this를 자동의로 읽어오지 않음
        // });
    }
};

theater.showMovieList();

