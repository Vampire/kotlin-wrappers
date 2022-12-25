@file:JsModule("react-beautiful-dnd")
@file:JsNonModule

package react.beautiful.dnd

import dom.html.HTMLElement
import react.Component
import react.Props
import react.ReactElement
import react.dom.html.HTMLAttributes

sealed external interface DroppableProps : Props {
    var droppableId: DroppableId
    var type: TypeId?
    var mode: DroppableMode?
    var isDropDisabled: Boolean?
    var isCombineEnabled: Boolean?
    var direction: Direction?
    var ignoreContainerClipping: Boolean?
    var renderClone: DraggableChildrenFn?
    var getContainerForClone: (() -> HTMLElement)?
    var children: (provided: DroppableProvided, snapshot: DroppableStateSnapshot) -> ReactElement<HTMLAttributes<*>>
}

external val Droppable: Component<DroppableProps, *>
