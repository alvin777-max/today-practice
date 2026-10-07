import { create } from "zustand";
import { persist } from "zustand/middleware";

export const usePersistStore = create(
    persist(    //zustand의 기능을 확장하는 미들웨어(추가기능)
                //상태를 변경하고 localstorage에 저장함- 새로고침 시 store상태 복원
        (set) => ({
            theme: "light", 
            toggleTheme: () => 
                set((state) => 
                    ({theme: state.theme === "light" ? "dark" : "light"})), //store 내용
        }),
        { name: "theme-storage", }  // localStorage에 저장할 때 사용할 키 이름
    )
)
