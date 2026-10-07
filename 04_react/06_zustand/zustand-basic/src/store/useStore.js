import { create } from "zustand";

export const useStore = create((set)=> ({
    count: 0,   // 데이터
    text: "",

    // set: zustand store에 저장된 상태를 변경하는 함수 /상태를 바꾸는 스위치
    // state: 현재 store에 있는 데이터의 '스냅샷'
    increase: () => set((state) => ({count: state.count + 1})), // 데이터를 조작하는 방법
    decrease: () => set((state) => ({count: state.count - 1})), //원래값을 알아야함 -> state필요(스냅샷)

    setText: (value) => set({text: value}) // 원래값을 몰라도 됨-값을 덮어씌움
}))